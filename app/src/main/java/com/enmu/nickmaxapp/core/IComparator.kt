package com.enmu.nickmaxapp.core

interface IComparator<E> {
    fun compare(comparingItem : E) : Boolean
}