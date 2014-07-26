package com.hackbulgaria.corejava;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class TimeTracker {
	private HashMap<String, Operation> opers = new HashMap<>();
	private long finish;
	private String report = new String();
	
	class Operation {
		private ArrayList<Long> updates = new ArrayList<>();
		private long started;
		protected long finished;
		
		public Operation() {
			this(0);
		}
		
		public Operation(long sTime) {
			started = sTime;
		}
		
		public void addUpdate(long update){
			updates.add(update);
			
		}
		public String getReport(){
			StringBuilder report = new StringBuilder();

			report.append(" took " + (finished-started) + "ms" + System.lineSeparator());
			report.append("\"" + new Date(started).toGMTString() + "\" - started" + System.lineSeparator());
			for(long up: updates){
				report.append("\"" + new Date(up).toGMTString() + "\" - update" + System.lineSeparator());
			}
			report.append("\"" + new Date(finished).toGMTString() + "\" - finished" + System.lineSeparator());
			
			return report.toString();
		}
	}
	
	
	public long start(String operation){
		long start = System.currentTimeMillis();
		opers.put(operation, new Operation(start));
		return start;
	}
	
	public long update(String operation){
		long current = System.currentTimeMillis();
		opers.get(operation).addUpdate(current);
		return current;
	}
	
	public long finish(String operation){
		opers.get(operation).finished = System.currentTimeMillis();
		return System.currentTimeMillis();
	}
	
	public String getReport(String operation){
		return operation + opers.get(operation).getReport();
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		final TimeTracker timetracker = new TimeTracker();
		
		timetracker.start("Copy");
		timetracker.update("Copy");
		
		Thread.sleep(100);
		timetracker.start("Paste");
		timetracker.finish("Paste");
		timetracker.update("Paste");
		timetracker.finish("Copy");
		
		
		
		System.out.println(timetracker.getReport("Copy"));
		System.out.println(timetracker.getReport("Paste"));
		
		
	}
	
	

}
