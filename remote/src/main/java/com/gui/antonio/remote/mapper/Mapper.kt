package com.gui.antonio.remote.mapper

interface Mapper<F, T> {
    fun from(f: F): T
    fun to(t: T): F
}