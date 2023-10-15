package architectorySeminar8.mvi.view;

import architectorySeminar8.mvi.model.TasksViewState;
import architectorySeminar8.mvi.model.ViewState;

public class ConsoleView implements BaseView {

    @Override
    public void render(ViewState state) {
        if (state instanceof TasksViewState) {
            TasksViewState tasksState = (TasksViewState) state;
            System.out.println(tasksState);
        } else {
            System.out.println("Неизвестное состояние.");
        }
    }
}
