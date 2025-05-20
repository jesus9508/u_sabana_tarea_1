public class User {
    private String name;
    private ChatRoomMediator chatRoom;

    public User(String name) {
        this.name = name;
    }

    public void setChatRoom(ChatRoomMediator chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        if (chatRoom != null) {
            System.out.println(this.name + " envía: " + message);
            chatRoom.sendMessage(message, this);
        } else {
            System.out.println(this.name + " no está en una sala de chat.");
        }
    }

    public void receive(String message, String senderName) {
        System.out.println(this.name + " recibe mensaje de " + senderName + ": \"" + message + "\"");
    }
}