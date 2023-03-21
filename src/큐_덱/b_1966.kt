package 큐_덱

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    var st: StringTokenizer
    val sb = StringBuilder()
    for(i in 0 until T){
        st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        var index = st.nextToken().toInt()
        val array = Array(10){0}
        queue.clear()
        var count = 0
        st = StringTokenizer(br.readLine())
        for(i in 0 until n){
            val num = st.nextToken().toInt()
            array[num]++
            queue.add(num)
        }

        loop@while(true){
            val outNum = queue.remove()
            for(i in outNum+1 until array.size){
                if(array[i]>0){
                    queue.add(outNum)
                    if(index==0) index = queue.size-1
                    else index--
                    continue@loop
                }
            }
            array[outNum]--
            count++
            if(index==0){
                sb.append(count).append("\n")
                break
            }
            index--
        }
    }
    println(sb)
}