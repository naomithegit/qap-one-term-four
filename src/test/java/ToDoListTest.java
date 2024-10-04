import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {

    private ToDoList toDoList = new ToDoList();

    @BeforeEach
    public void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    public void testAddTask() {
        toDoList.addTask("Walk Dog");
        assertEquals(1, toDoList.getTasks().size());
    }

    @Test
    public void testCompleteTask() {
        toDoList.addTask("Walk Dog");
        toDoList.completeTask("Walk Dog");
        assertTrue(toDoList.isTaskCompleted("Walk Dog"));
    }

    @Test
    public void testIsTaskCompletedFalse() {
        toDoList.addTask("Feed Cat");
        assertFalse(toDoList.isTaskCompleted("Feed Cat"));
    }

    @Test
    public void testAddMultipleTasks() {
        toDoList.addTask("Finish QAP");
        toDoList.addTask("Play Pickle Ball");
        toDoList.addTask("Do Groceries");
        assertEquals(3, toDoList.getTasks().size());
    }

    @Test
    public void testFindTaskByName() {
        toDoList.addTask("Bake Brownies");
        toDoList.getTasks().getFirst();


    }


}

///like so tired.

