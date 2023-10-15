package architectorySeminar8.mvpvm.view;

import architectorySeminar8.mvpvm.modelView.TaskViewModel;

import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}