# SI_2024_lab2_225125
Симеон Ристовски 225125

2. Control Flow Graph

Control Flow Graph Го изработив на Draw io. Изгледот на мојот Graph можи да се види во поднесената документација.

3. Цикломатска комплексност

Цикломатската комплексност на Control Flow Graph е 10. Таа ја пресметав со користење на формулата C=E-N+2. Каде N е бројот на темиња кој е еднаков на 31, Е претставува број на ребра и во мојот Graph има 39 ребра. Со тоа C=39-31+2=10.

4. Тест случаи според критериумот Every Branch

Со овие тест случаи се изминува секоја можна гранка во Control Flow графот.

- List<Item> allItems1 = null;
- List<Item> allItems2 = new ArrayList<Item>();
- List<Item> allItems3 = new ArrayList<Item>();
- List<Item> allItems4 = new ArrayList<Item>();
- List<Item> allItems5 = new ArrayList<Item>();

- Item item2 = new Item("",null,160,10);
- Item item3 = new Item("Кафе","kafe",160,10);
- Item item4 = new Item("Кафе","0123456789",160,10);
- Item item5 = new Item("Кафе","0123456789",160,0);

- allItems2.add(item2);
- allItems3.add(item3);
- allItems4.add(item4);
- allItems5.add(item5);

- SILab2.checkCart(allItems1,160)
- SILab2.checkCart(allItems2,160)
- SILab2.checkCart(allItems3,160)
- SILab2.checkCart(allItems4,150)
- SILab2.checkCart(allItems5,190)

За подобар преглед на тест случаите можете да ги погледнете во Java проектот.


5. Тест случаи според критериумот Multiple Condition

- List<Item> allItems1 = new ArrayList<Item>();
- List<Item> allItems2 = new ArrayList<Item>();
- List<Item> allItems3 = new ArrayList<Item>();
- List<Item> allItems4 = new ArrayList<Item>();

- Item item1 = new Item("Кафе","0123456789",330,1);
- Item item2 = new Item("Кафе","123456789",330,1);
- Item item3 = new Item("Кафе","0123456789",330,0);
- Item item4 = new Item("Кафе","0123456789",300,0);

- allItems1.add(item1);
- allItems2.add(item2);
- allItems3.add(item3);
- allItems4.add(item4);

- assertTrue(SILab2.checkCart(allItems1,300));
- assertFalse(SILab2.checkCart(allItems2,300));
- assertFalse(SILab2.checkCart(allItems3,300));
- assertFalse(SILab2.checkCart(allItems4,200));

За подобар преглед на тест случаите можете да ги погледнете во Java проектот.

6. Објаснување на напишаните unit tests

- За Every Branch тестовите искористив три тестови со assertThrows и два тестови со assertTrue/False.
- За Multiple Condition тестовите искористив 4 items од кои 1 ги исполнуваше сите 3 if услови, останатите 3 не задоволуваја 1,2 или 3 од зададените if услови.
