package com.momtaz.dataroom

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.cancellation.CancellationException


// task 1
//fun main() = runBlocking {
//    val job = launch {
//        repeat(10) {
//            println(it + 1)
//            delay(500L) // 500ms delay
//        }
//    }
//    job.join()
//}

// task 2

//fun main() = runBlocking {
//    val number = 5
//    val factorial = async { factorial(number) }
//    println("Factorial of $number is ${factorial.await()}")
//}
//
//suspend fun factorial(n: Int): Long = coroutineScope {
//    if (n == 0) return@coroutineScope 1L
//    (1..n).map { async { it.toLong() } }.awaitAll().reduce { acc, i -> acc * i }
//}

// task 3
//fun main() = runBlocking {
//    val job1 = launch {
//        try {
//            repeat(20) {
//                println("Job 1: $it")
//                delay(1000L)
//            }
//        } catch (e: CancellationException) {
//            println("Job 1 was cancelled")
//        }
//    }
//
//    val job2 = launch {
//        try {
//            repeat(20) {
//                println("Job 2: $it")
//                delay(1000L)
//            }
//        } catch (e: CancellationException) {
//            println("Job 2 was cancelled")
//        }
//    }
//
//    delay(10000L)
//    job1.cancelAndJoin()
//    job2.cancelAndJoin()
//}

// task 4

//fun main() = runBlocking {
//    val array = arrayOf(1, 2, 3, 4, 5)
//    val sum = sumArray(array)
//    println("Sum of array elements: $sum")
//}
//
//suspend fun sumArray(arr: Array<Int>): Int = coroutineScope {
//    arr.sum()
//}
//
// task 5
//
//fun main() = runBlocking {
//    val job = launch {
//        repeat(10) {
//            println("Working on job... $it")
//            delay(500L)
//        }
//    }
//
//    delay(2000L)
//    println("Main: Waiting for job to finish")
//    job.join()
//
//    val job2 = launch {
//        repeat(10) {
//            println("Working on job2... $it")
//            delay(500L)
//        }
//    }
//
//    delay(2000L)
//    println("Main: Canceling job2")
//    job2.cancelAndJoin()
//    println("Main: Job2 has been canceled")
//}
//
