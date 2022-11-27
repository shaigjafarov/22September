//package com.company.lesson25;
//
//public class Items
//{
//    public void add(Item item) {  }
//}
//
//public class RedItems extends Items
//{
//    @Override
//    public void add(Item item)
//    {
//        if (!item.isRed())
//        {
//            throw new RuntimeException();
//        }
//        super.add(item);
//    }
//}
//
//public class BigRedItems extends RedItems
//{
//    @Override
//    public void add(Item item)
//    {
//        if (!item.isBig())
//        {
//            throw new RuntimeException();
//        }
//        super.add(item);
//    }
//}