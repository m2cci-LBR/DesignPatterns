package com.capgemini.proxy;

public class CommandExecutorImpl implements CommandExcecutor{

    @Override
    public void executeCommand(String cmd) throws Exception {
       System.out.println("Command " + cmd + " was successfully executed");
    }
}
