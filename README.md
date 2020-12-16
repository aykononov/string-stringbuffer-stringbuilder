# String-StringBuffer-StringBuilder

## Класс String 

### Имеет две фундаментальные особенности: 

* **final** - у класса String не может быть наследников
* **immutable** (неизменный) - экземпляры класса нельзя изменить после создания

### Важные преимущества:

* Благодаря неизменности, хэшкод экземпляра класса String кэшируется. Его не нужно вычислять каждый раз, потому что значения полей объекта никогда не изменятся после его создания. Это дает высокую производительность при использовании данного класса в качестве ключа для HashMap.
* Класс String можно использовать в многопоточной среде без дополнительной синхронизации.
* Еще одна особенность класса String — для него перегружен оператор "+". Поэтому конкатенация (сложение) строк выполняется довольно просто.

### Недостатки:
В силу неизменности класса String, в результате каждой операции создаются новые экземпляры строк, а старые отбрасываются, порождая большое количество мусора.

### Основные методы строк:

* lengtn() — возвращает длину строки;
* charAt(int number) — возвращает символ по указанному индексу. Отсчет идет с 0;
* indexOf(char sumbol) — возвращает индекс по указанному символу. Если символ не найден возвращается -1;
* substring(int startIndex) — возвращает подстроку строки начиная с указанного индекса;
* substring(int startIndex, int endIndex) — возвращает подстроку строки начиная с указанного индекса и заканчивая указанным индексом;
* startsWith(String sumbolOrSumbols) — возвращает true если строка начинается с указанного слова или символа;
* toLowerCase() — переводит строку в нижний регистр;
* toUpperCase() — переводит строку в верхний регистр;
* replaceAll(String partWhichReplace, String partOnWhichReplace) — заменяет часть строки на заменяемую строку
* equals(String strToCompare) — сравнение строк.  
  Данный метод используется для сравнения объектов не по ссылке, а по содержанию;
* equalsIgnoreCase(String strToCompare) — сравнение без учета регистра;
* trim() — убирает пробелы в конце и в начале строки (если есть);
* toCharArray() — разбивает строку на массив char;
* split(String reqexp) — разбивает строку по заданному символу.

<details><summary>Пример - StringExample.java</summary>

```java
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
```

</details>


[StringExample.java](https://github.com/aykononov/string-stringbuffer-stringbuilder/blob/main/src/main/java/StringExample.java "https://github.com/aykononov/string-stringbuffer-stringbuilder/blob/main/src/main/java/StringExample.java" )


## Класс StringBuffer
* **mutable** класс, т.е. изменяемый.  
  Объект класса StringBuffer может содержать в себе определенный набор символов, длину и значение которого можно изменить через вызов определенных методов.

### Преимущества:
* StringBuffer — изменяемый класс, поэтому при работе с ним не возникает такого же количества мусора в памяти, как со String. Поэтому если над строками проводится много модификаций, лучше использовать StringBuffer.
* StringBuffer — потокобезопасный класс. Его методы синхронизированы, а экземпляры могут быть использованы несколькими потоками одновременно.

### Недостатки:
С одной стороны, потокобезопасность — преимущество класса, а с другой — недостаток. 
Синхронизированные методы работают *медленнее* не сихнронизированных.

### У класса StringBuffer есть ряд методов:

* delete(int start, int end) — удаляет подстроку символов начиная с позиции start, заканчивая end
* deleteCharAt(int index) — удаляет символ в позиции index
* insert(int offset, String str) — вставляет строку str в позицию offset. Метод insert также перегружен и может принимать различные аргументы
* replace(int start, int end, String str) — заменит все символы начиная с позиции start до позиции end на str
* reverse() — меняет порядок всех символов на противоположный
* substring(int start) — вернет подстроку, начиная с позиции start
* substring(int start, int end) — вернет подстроку, начиная с позиции start до позиции end

<details><summary>Пример - StringBufferExample.java</summary>

```java
public class StringBufferExample {

    public static void main(String[] args) {
        String numbers = "0123456789";
        StringBuffer sb = new StringBuffer(numbers);

        System.out.println(sb.substring(3)); 
        // 3456789

        System.out.println(sb.substring(4, 8)); 
        // 4567

        System.out.println(sb.replace(3, 5, "ABCDE"));
        // 012ABCDE56789

        sb = new StringBuffer(numbers);
        System.out.println(sb.reverse());
        // 9876543210

        sb.reverse();
        // Вернем изначальный порядок

        sb = new StringBuffer(numbers);
        System.out.println(sb.delete(5, 9));
        // 012349

        System.out.println(sb.deleteCharAt(1));
        // 02349

        System.out.println(sb.insert(1, "One"));
        // 0One2349

    }
}
```

</details>

[StringBufferExample.java](https://github.com/aykononov/string-stringbuffer-stringbuilder/blob/main/src/main/java/StringBufferExample.java "https://github.com/aykononov/string-stringbuffer-stringbuilder/blob/main/src/main/java/StringBufferExample.java" )

## Класс StringBuilder

Он очень похож на **StringBuffer**. Разница лишь в том, что **StringBuffer** потокобезопасен, и все его методы *синхронизированы*, а **StringBuilder** — нет. Это единственная особенность.

**StringBuilder** в Java работает быстрее **StringBuffer’а** благодаря несинхронизированности методов, поэтому в большинстве случаев, кроме *многопоточной* среды, лучше использовать **StringBuilder**.