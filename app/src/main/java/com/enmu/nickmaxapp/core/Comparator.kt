package com.enmu.nickmaxapp.core

class Comparator<E>(
    private val item : E
) : IComparator<E> {
    override fun compare(comparingItem : E) = item == comparingItem
}