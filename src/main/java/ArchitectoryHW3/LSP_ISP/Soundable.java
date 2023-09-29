package ArchitectoryHW3.LSP_ISP;
// используя интерфейсы применяем один из принципов SOLID, Interface Segregation Principle (Принцип разделения интерфейса)
// реализуя каждый метод в отдельном интерфейсе
/**
 * Тип животных, умеющих издавать звуки
 */
public interface Soundable {
    String getSound();
}
