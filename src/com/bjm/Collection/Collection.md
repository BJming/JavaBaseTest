#Collection 接口及操作
Collection 接口是所有集合类型的根接口，它有三个子接口：Set接口、List接口和Queue接口。

Collection接口的定义如下：

public  interface Collection<E> extends Iterable<E>{
    
    //基本操作
    
    int size();
    
    boolean isEmpty();
    
    boolean add(E element);
    
    boolean remove(Object element);
    
    Iterator iterator();
    
    //批量操作
    
    boolean containsAll(Collection<?> c);
    
    boolean addAll(Collection<? extends E> c);
    
    boolean retainAll(Collection<?> c);
    
    void clear();
    
    //数组操作
    
    Object[] toArray();
    
    <T> T[] toArray(T[] a);
    
}

###1.基本操作

实现基本操作的方法有

size()，返回集合中元素的个数

isEmpty(),返回集合是否为空

contains(),返回集合中是否包含指定的对象

add(),实现集合中添加元素的功能

remove(),实现集合中删除元素的功能

iterator(),用来返回Iterator对象

通过基本操作可以检索集合中的元素。检索集合中的元素有两种方法：

1、使用增强的for循环

使用增强的for循环不仅可以遍历数组中的每一个元素对象。

for( Object o : collection) System.out.println(o);

2、使用迭代器

迭代器是一个可以遍历集合中每一个元素的对象。通过调用集合对象的iterator()方法可以得到Iterator对象，再调Iterator对象的方法就可以遍历集合中的每一个元素。

public interface Iterator<E>{
    
    boolean hasNext();
    
    E next();
    
    void remove();
}

该接口的hasNext()方法返回迭代器中是否还有对象；

next()方法返回迭代器中下一个对象；

remove()方法删除迭代器中的对象，该方法同时从集合中删除对象

假设 c 为一个Collection对象，要访问 c 中的每一个元素，可以按下列方式实现

Iterator it = c.iterator();

while(it.hasNext()){
    System.out.println(it.next());
}

###2、批量操作

实现批量操作的方法有containsAll()，它返回集合中是否包含指定集合中的所有元素

addAll(), 将指定集合中的元素添加到集合中

removeAll(),从集合中删除指定的集合元素

retainAll(),删除集合中的不属于指定集合中的元素

clear(),删除集合中的所有元素

###3、数组操作

toArray()方法可以实现集合与数组的转换。将集合元素转换到数组元素。

无参数的toArray()，可以实现将集合转换成Object类型的数组

有参数的toArray(),将集合转换为指定类型的对象数组

    假设 c 是一个Collection对象，下面将c的对象转换成一个新的Object数组，数组的长度与 c的元素个数相同。
    Object[] a = c.toArray();
    
    假设 c 中只包含String对象，下面将 c转换成String数组，它的长度与c的元素个数相同
     
     String [] a = c.toArray(new String[0]);
P128 Java程序设计经典课堂
