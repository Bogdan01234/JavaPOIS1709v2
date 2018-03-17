public class HeadCounter {

    public static  String counter(int age) {
        int head = 1;
       /*int eyes = 2;  можно 2мя способами, с добавление дополнительной переменной "глаза", или без неё.
        int eyesCounter = 0;*/
        int headsCounter = 0;
        String resylt;

        for (int i = 1; i <= age; i++) {
            if (i < 200){
                headsCounter += head * 3;
               // eyesCounter += eyes * 3;
            } else if (i >= 200 && i < 300){
                headsCounter += head * 2;
               // eyesCounter += eyes * 2;
            } else {
                headsCounter += head;
               // eyesCounter += eyes;
            }
        }

        resylt = "The dragon who is " + age + " years old, has " + headsCounter + " heads and " + headsCounter * 2 /*eyesCounter*/ + " eyes";


        return resylt;
    }
}

