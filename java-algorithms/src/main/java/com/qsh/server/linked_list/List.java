package com.qsh.server.linked_list;

/**
 * @author: mini
 * @Date: 2024-04-11 11:05
 * @Description: 链表相关接口
 */
public interface List<E> {
    // 添加元素
    boolean add(E e);
    // 在首位添加元素
    boolean addFirst(E e);
    // 在末尾添加元素
    boolean addLast(E e);
    // 删除元素
    boolean remove(Object o);
    // 获取元素
    E get(int index);
    // 打印链表信息
    void printLinkList();
}
