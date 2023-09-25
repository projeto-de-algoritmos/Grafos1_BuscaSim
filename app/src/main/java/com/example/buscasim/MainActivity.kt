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

        var numeroDigitado: Int = -1
        var emExec: Boolean = false
        val g = Graph(15)

        g.addEdge(0, 9)
        g.addEdge(0, 13)
        g.addEdge(1, 7)
        g.addEdge(1, 8)
        g.addEdge(1, 9)
        g.addEdge(2, 9)
        g.addEdge(3, 6)
        g.addEdge(3, 8)
        g.addEdge(3, 13)
        g.addEdge(3, 14)
        g.addEdge(4, 6)
        g.addEdge(4, 11)
        g.addEdge(5, 8)
        g.addEdge(6, 3)
        g.addEdge(6, 4)
        g.addEdge(6, 11)
        g.addEdge(7, 1)
        g.addEdge(8, 3)
        g.addEdge(8, 5)
        g.addEdge(8, 12)
        g.addEdge(8, 14)
        g.addEdge(9, 0)
        g.addEdge(9, 1)
        g.addEdge(9, 2)
        g.addEdge(9, 10)
        g.addEdge(10, 9)
        g.addEdge(11, 6)
        g.addEdge(11, 4)
        g.addEdge(12, 8)
        g.addEdge(13, 0)
        g.addEdge(13, 3)
        g.addEdge(14, 3)
        g.addEdge(14, 8)

        println("Breadth-First Search:")

        binding.buttonComecar.setOnClickListener {
            setContentView(binding2.root)
        }

        binding2.button0.setOnClickListener {
            numeroDigitado = 0
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button1.setOnClickListener {
            numeroDigitado = 1
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button2.setOnClickListener {
            numeroDigitado = 2
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button3.setOnClickListener {
            numeroDigitado = 3
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button4.setOnClickListener {
            numeroDigitado = 4
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button5.setOnClickListener {
            numeroDigitado = 5
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button6.setOnClickListener {
            numeroDigitado = 6
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button7.setOnClickListener {
            numeroDigitado = 7
            if (!emExec) {
                binding2.textViewFilaElementos.text = numeroDigitado.toString()
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button8.setOnClickListener {
            numeroDigitado = 8
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button9.setOnClickListener {
            numeroDigitado = 9
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button10.setOnClickListener {
            numeroDigitado = 10
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button11.setOnClickListener {
            numeroDigitado = 11
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button12.setOnClickListener {
            numeroDigitado = 12
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button13.setOnClickListener {
            numeroDigitado = 13
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
        }
        binding2.button14.setOnClickListener {
            numeroDigitado = 14
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            }
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
        //binding2.textViewFilaElementos.text = numeroDigitado.toString()

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