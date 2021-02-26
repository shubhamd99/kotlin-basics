import java.lang.Exception

// MULTITHREADING in Java is a process of executing two or more threads simultaneously to maximum utilization of CPU.
// Multithreaded applications execute two or more threads run concurrently.
// Hence, it is also known as Concurrency in Java.
// Each thread runs parallel to each other.

fun main() {

    var thread1 = thread("thread1")
    // start() method causes this thread to begin execution
    thread1.start()

    var thread2 = thread("thread2")
    thread2.start()
    //  join() method which allows one thread to wait until another thread completes its execution.
    thread2.join()
    println("thread is running")
}

class thread(): Thread() {

    var ThreadName: String? = null

    constructor(ThreadName: String): this() {
        this.ThreadName = ThreadName
    }

    override fun run() {
        // Write Thread

        var count = 0
        while (count < 10) {
            println("Count $count, Thread ${this.ThreadName}")
            count++

            try {
                // Thread. sleep() method can be used to pause the execution of current thread for specified time in milliseconds.
                Thread.sleep(1000)
            } catch (exp: Exception) {
                println(exp.message)
            }

        }
    }
}