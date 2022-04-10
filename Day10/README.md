ArrayList

ArrayList 构造方法：
        ArrayList list = new ArrayList(): 创建一个空的集合对象
        可存放任意类型的数据，数据不严谨，改进：
        ArrayList<String> list = new ArrayList()，进行数据类型限制，

            但是<>当中只可编写引用数据类型，要存基本数据类型，则：
            byte        Byte
            short       Short
            int         Integer
            long        Long
            float       Float
            double      Double
            char        Character
            boolean     Boolean


    ArrayList 添加方法：
        public boolean add(E e): 将指定的元素加入集合的末尾
        public void add(int index, E element): 在集合中的特定位置加入特定元素

    ArrayList 常用方法：(E为当前集合中数据类型，如：int、String...)
        public boolean remove(Object o): 删除指定的元素，返回是否成功
        public E remove(int index): 删除指定索引处的元素，返回被删除的元素
        public E set(int index, E element): 修改指定索引处的元素，返回被修改的元素
        public E get(int index): 返回索引处的元素
        public int size(): 返回集合中元素的个数
