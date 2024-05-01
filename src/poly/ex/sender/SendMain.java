<<<<<<< HEAD
package poly.ex.sender;

public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
=======
package poly.ex.sender;public class SendMain {
>>>>>>> a9b1a69cd535fa5c0cad28b44c5b7d0bad91ae4c
}
