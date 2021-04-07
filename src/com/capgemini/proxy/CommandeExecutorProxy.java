package com.capgemini.proxy;

public class CommandeExecutorProxy implements CommandExcecutor{

    private boolean isAdmin = false;
    private CommandExcecutor commandExcecutor;

    public CommandeExecutorProxy(String login, String password) {
        isAdmin = "ali".equals(login) && "passw".equals(password);
        commandExcecutor = new CommandExecutorImpl();
    }

    @Override
    public void executeCommand(String cmd) throws Exception {
       if (isAdmin){
           System.out.println("Executing " + cmd + " as ADMIN");
           commandExcecutor.executeCommand(cmd);
       } else {
           if (cmd.contains("rm")){
               throw new Exception("You don't have admin access to execute this command");
           } else {
               commandExcecutor.executeCommand(cmd);
           }
       }
    }
}
