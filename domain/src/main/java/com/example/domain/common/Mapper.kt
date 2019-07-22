package com.example.domain.common

interface Mapper<in T, out R> {
    fun map(model: T): R
}