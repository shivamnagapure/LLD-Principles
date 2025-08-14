package Lesson2.Example1.BetterCode;

public interface Notification {
    // If we add have to add New notification , then  we have add new notification class
    // does not need to change to other code
    //Extensibility Maintain here
    void send();
}
