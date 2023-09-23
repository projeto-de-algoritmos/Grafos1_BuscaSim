package com.example.buscasim

import android.content.pm.ActivityInfo
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.buscasim.databinding.ActivityMainBinding
import com.example.buscasim.databinding.TelaInicioBinding
import java.util.LinkedList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: TelaInicioBinding
    private lateinit var binding2: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window?.statusBarColor = ContextCompat.getColor(this, R.color.black)
        }

        binding = TelaInicioBinding.inflate(layoutInflater)
        binding2 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val g = Graph(15)

        g.addEdge(0, 1)
        g.addEdge(0, 4)
        g.addEdge(1, 2)
        g.addEdge(1, 3)
        g.addEdge(1, 4)
        g.addEdge(2, 3)
        g.addEdge(3, 4)

        println("Breadth-First Search:")
        g.BFS(0)

        binding.buttonComecar.setOnClickListener {
            setContentView(binding2.root)
        }
    }
}

class Graph(private val numVertices: Int) {
    private val adjLists: Array<LinkedList<Int>>

    init {
        adjLists = Array(numVertices) {
            LinkedList<Int>()
        }
    }

    fun addEdge(src: Int, dest: Int) {
        adjLists[src].add(dest)
    }

    fun BFS(startVertex: Int) {
        val visited = BooleanArray(numVertices)
        val queue = LinkedList<Int>()

        visited[startVertex] = true
        queue.add(startVertex)

        while (queue.isNotEmpty()) {
            val vertex = queue.poll()
            print("$vertex ")

            for (i in adjLists[vertex]) {
                if (!visited[i]) {
                    queue.add(i)
                    visited[i] = true
                }
            }
        }
    }
}