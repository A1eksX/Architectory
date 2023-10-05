package architectorySeminar5.calculator;
/*
Сформируйте компоненты: Разбейте вашу систему на горизонтальные уровни и вертикальные срезы,
как было обсуждено на семинаре. Создайте классы или компоненты для каждого уровня и среза, определите
их функции и отношения друг с другом.
 */
public class Main {
    // Горизонтальные уровни архитектуры калькулятора

    // Уровень ввода и вывода
    class InputOutputLayer {
        String getInput() {
            // Чтение ввода пользователя
            return null;
        }

        void displayOutput(String result) {
            // Вывод результата на экран
        }
    }

    // Уровень вычислений
    class CalculationLayer {
        double add(double a, double b) {
            // Сложение
            return 1.0;
        }

        double subtract(double a, double b) {
            // Вычитание
            return 1.0;
        }

        double multiply(double a, double b) {
            // Умножение
            return 1.0;
        }

        double divide(double a, double b) {
            // Деление
            return 1.0;
        }
    }

    // Уровень управления
    class ControlLayer {
        InputOutputLayer ioLayer;
        CalculationLayer calcLayer;

        ControlLayer() {
            ioLayer = new InputOutputLayer();
            calcLayer = new CalculationLayer();
        }

        void runCalculator() {
            String input = ioLayer.getInput();
            // Анализ ввода и управление вычислениями
            // Вывод результата с использованием ioLayer
        }
    }
}
