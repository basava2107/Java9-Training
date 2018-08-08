package com.training;

public class UsingProcessAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessHandle currentProcess = ProcessHandle.current();
		
		System.out.println("Current Process Pid :: " + currentProcess.pid());
		
		System.out.println("Current Process Parent :: " + currentProcess.parent());
		
		System.out.println("Current Process Is Alive :: " + currentProcess.isAlive());
		
		System.out.println("Current Process Children :: " + currentProcess.children()); 
		
		System.out.println("Current Process Info :: " + currentProcess.info()); 
		
		
		
		Process notePad = null;
		
		try {
			notePad = new ProcessBuilder("notepad.exe").start(); 
			//notePad.start();
			
			Thread.sleep(2000);
			
			notePad.destroy();
		
		} catch(Exception e) {
			
		}
		
	}

}
