package ArchitectorySeminar2.builder;

/*
Паттерн Строитель, суть в том, чтобы по кирпичикам собрать целый объект,
т.е. в методе Computer прописан конструктор:
    public Computer(String cpu, String gpu, int ram, int storage, String os) {
            this.cpu = cpu;
            this.gpu = gpu;
            this.ram = ram;
            this.storage = storage;
            this.os = os;
        }
в котором по идее надо жёстко прописывать ВСЕ параметры, но используя методы данного класса, можно
уйти от этого. В этом случае вместо отсутствующего параметра будет указано 0 (если это тип int), или
null (если это тип String)
 */
public class ComputerBuilder {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    private String os;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, gpu, ram, storage, os);
    }
}
