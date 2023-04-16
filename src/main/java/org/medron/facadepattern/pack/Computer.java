package org.medron.facadepattern.pack;

import lombok.RequiredArgsConstructor;


public class Computer {
    private String cpuName;
    private String gpuName;
    private final Cpu cpu;
    private  final Gpu gpu;

    public Computer(String cpuName, String gpuName){
        cpu = new Cpu(cpuName);
        gpu = new Gpu(gpuName);
        this.gpuName = gpuName;
        this.cpuName = cpuName;
    }
    public void pressStart(){
        cpu.launch();
        gpu.launch();
    }
    public void pressStop(){
        gpu.terminate();
        cpu.terminate();
    }
}
