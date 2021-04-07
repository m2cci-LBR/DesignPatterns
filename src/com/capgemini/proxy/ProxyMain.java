package com.capgemini.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        CommandExcecutor cmdLine = new CommandeExecutorProxy("ali","passw");

        try {
         cmdLine.executeCommand("ls -a");
         cmdLine.executeCommand("rm some folder");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
