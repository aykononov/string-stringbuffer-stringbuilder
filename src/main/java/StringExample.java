public class StringExample {

    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("Длина строки: " + str.length());
        System.out.println("Cимвол по индексу [2]: " + str.charAt(2));//отсчет с 0
        System.out.println("Индекс символа (o): " + str.indexOf("o"));
        System.out.println("Индекс символа (y): " + str.indexOf("y"));//-1 так как символа не найдено
        System.out.println("Получить подстроку [3-6]: " + str.substring(3, 6));
        System.out.println("строка начинается с указанного слова (He): " + str.startsWith("He"));
        System.out.println("Перевести в нижний регистр: " + str.toLowerCase());
        System.out.println("Перевести в верхний регистр: " + str.toUpperCase());
        System.out.println("Замена группы символов: " + str.replaceAll("world", "mir"));
        System.out.print("Разбиение на символы: ");
        String[] stringArray = str.split("");//разбиение на символы

        //по сути метод стал похож на toCharArray
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + ", ");
        }

        System.out.print("\nРазбиение по знаку (;) - ");
        String str2 = "I;And;Big;Java;Post;gres";
        String[] strArr = str2.split(";");//разбиение по знаку (;)

        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + ", ");
        }
    }
}

/* ---------------------------------------------------
Длина строки: 11
Cимвол по индексу [2]: l
Индекс символа (o): 4
Индекс символа (y): -1
Получить подстроку [3-6]: lo
строка начинается с указанного слова (He): true
Перевести в нижний регистр: hello world
Перевести в верхний регистр: HELLO WORLD
Замена группы символов: Hello mir
Разбиение на символы: H, e, l, l, o,  , w, o, r, l, d,
Разбиение по знаку (;) - I, And, Big, Java, Post, gres,
 */