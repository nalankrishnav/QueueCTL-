package com.queuectl;

import picocli.CommandLine;


@CommandLine.Command(
    name = "queuectl",
    mixinStandardHelpOptions = true,
    version = "queuectl 0.0.1",
    description = "CLI-based background job queue controller"
)
public class QueueCtlApplication implements Runnable {

    @Override
    public void run() {
        System.out.println("queuectl: use --help to see available commands");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new QueueCtlApplication()).execute(args);
        System.exit(exitCode);
    }
}
