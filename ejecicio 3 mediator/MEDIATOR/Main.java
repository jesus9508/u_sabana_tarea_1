public class Main {
    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoom();

        User alice = new User("Alice");
        User bob = new User("Bob");
        User carol = new User("Carol");

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(carol);

        alice.send("¡Hola a todos!");
        bob.send("¡Hola Alice!");
    }
}