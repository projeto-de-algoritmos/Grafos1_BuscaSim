package com.example.buscasim

import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
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

        var numeroDigitado: Int
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
        g.addEdge(8, 1)
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

        binding.buttonComecar.setOnClickListener {
            setContentView(binding2.root)
        }
        binding2.buttonVoltar.setOnClickListener {
            setContentView(binding.root)
        }
        binding2.buttonInfo.setOnClickListener {
            binding2.info.isVisible = true
        }
        binding2.buttonFecharInfo.setOnClickListener {
            binding2.info.isVisible = false
        }

        binding2.button0.setOnClickListener {
            numeroDigitado = 0
            binding2.button0.text = "0"
            binding2.button0.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button1.setOnClickListener {
            numeroDigitado = 1
            binding2.button1.text = "1"
            binding2.button1.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button2.setOnClickListener {
            numeroDigitado = 2
            binding2.button2.text = "2"
            binding2.button2.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button3.setOnClickListener {
            numeroDigitado = 3
            binding2.button3.text = "3"
            binding2.button3.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button4.setOnClickListener {
            numeroDigitado = 4
            binding2.button4.text = "4"
            binding2.button4.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button5.setOnClickListener {
            numeroDigitado = 5
            binding2.button5.text = "5"
            binding2.button5.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button6.setOnClickListener {
            numeroDigitado = 6
            binding2.button6.text = "6"
            binding2.button6.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button7.setOnClickListener {
            numeroDigitado = 7
            binding2.button7.text = "7"
            binding2.button7.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button8.setOnClickListener {
            numeroDigitado = 8
            binding2.button8.text = "8"
            binding2.button8.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button9.setOnClickListener {
            numeroDigitado = 9
            binding2.button9.text = "9"
            binding2.button9.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button10.setOnClickListener {
            numeroDigitado = 10
            binding2.button10.text = "10"
            binding2.button10.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button11.setOnClickListener {
            numeroDigitado = 11
            binding2.button11.text = "11"
            binding2.button11.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button12.setOnClickListener {
            numeroDigitado = 12
            binding2.button12.text = "12"
            binding2.button12.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button13.setOnClickListener {
            numeroDigitado = 13
            binding2.button13.text = "13"
            binding2.button13.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
        binding2.button14.setOnClickListener {
            numeroDigitado = 14
            binding2.button14.text = "14"
            binding2.button14.isEnabled = false
            if (!emExec) {
                emExec = true
                g.BFS(numeroDigitado)
            } else g.BFS_Visit(numeroDigitado)
        }
    }
    inner class Graph(private val numVertices: Int) {
        private val adjLists: Array<LinkedList<Int>>
        private val visited = BooleanArray(numVertices)
        private var queue = LinkedList<Int>()
        private var vertex = -1
        private var qtdVizinhos = 0
        init {
            adjLists = Array(numVertices) {
                LinkedList<Int>()
            }
        }

        fun addEdge(src: Int, dest: Int) {
            adjLists[src].add(dest)
        }

        fun BFS(startVertex: Int) {
            visited[startVertex] = true
            queue.add(startVertex)
            binding2.textViewFilaElementos.text = queue.toString()

            binding2.button0.isVisible = false
            binding2.button1.isVisible = false
            binding2.button2.isVisible = false
            binding2.button3.isVisible = false
            binding2.button4.isVisible = false
            binding2.button5.isVisible = false
            binding2.button6.isVisible = false
            binding2.button7.isVisible = false
            binding2.button8.isVisible = false
            binding2.button9.isVisible = false
            binding2.button10.isVisible = false
            binding2.button11.isVisible = false
            binding2.button12.isVisible = false
            binding2.button13.isVisible = false
            binding2.button14.isVisible = false

            when (startVertex) {
                0 -> {binding2.aresta09.isVisible = true; binding2.aresta013.isVisible = true; binding2.button0.isVisible = true}
                1 -> {binding2.aresta17.isVisible = true; binding2.aresta18.isVisible = true; binding2.aresta19.isVisible = true; binding2.button1.isVisible = true}
                2 -> {binding2.aresta29.isVisible = true; binding2.button2.isVisible = true}
                3 -> {binding2.aresta36.isVisible = true; binding2.aresta38.isVisible = true; binding2.aresta313.isVisible = true; binding2.aresta314.isVisible = true; binding2.button3.isVisible = true}
                4 -> {binding2.aresta46.isVisible = true; binding2.aresta411.isVisible = true; binding2.button4.isVisible = true}
                5 -> {binding2.aresta58.isVisible = true; binding2.button5.isVisible = true}
                6 -> {binding2.aresta36.isVisible = true; binding2.aresta46.isVisible = true; binding2.aresta611.isVisible = true; binding2.button6.isVisible = true}
                7 -> {binding2.aresta17.isVisible = true; binding2.button7.isVisible = true}
                8 -> {binding2.aresta18.isVisible = true; binding2.aresta38.isVisible = true; binding2.aresta58.isVisible = true; binding2.aresta812.isVisible = true; binding2.aresta814.isVisible = true; binding2.button8.isVisible = true}
                9 -> {binding2.aresta09.isVisible = true; binding2.aresta19.isVisible = true; binding2.aresta29.isVisible = true; binding2.aresta910.isVisible = true; binding2.button9.isVisible = true}
                10 -> {binding2.aresta910.isVisible = true; binding2.button10.isVisible = true}
                11 -> {binding2.aresta411.isVisible = true; binding2.aresta611.isVisible = true; binding2.button11.isVisible = true}
                12 -> {binding2.aresta812.isVisible = true; binding2.button12.isVisible = true}
                13 -> {binding2.aresta013.isVisible = true; binding2.aresta313.isVisible = true; binding2.button13.isVisible = true}
                14 -> {binding2.aresta314.isVisible = true; binding2.aresta814.isVisible = true; binding2.button14.isVisible = true}
            }

            for (i in adjLists[startVertex]) {
                qtdVizinhos++
                when (i) {
                    0 -> binding2.button0.isVisible = true
                    1 -> binding2.button1.isVisible = true
                    2 -> binding2.button2.isVisible = true
                    3 -> binding2.button3.isVisible = true
                    4 -> binding2.button4.isVisible = true
                    5 -> binding2.button5.isVisible = true
                    6 -> binding2.button6.isVisible = true
                    7 -> binding2.button7.isVisible = true
                    8 -> binding2.button8.isVisible = true
                    9 -> binding2.button9.isVisible = true
                    10 -> binding2.button10.isVisible = true
                    11 -> binding2.button11.isVisible = true
                    12 -> binding2.button12.isVisible = true
                    13 -> binding2.button13.isVisible = true
                    14 -> binding2.button14.isVisible = true
                }
            }
            vertex = queue.poll()

        }
        fun BFS_Visit(numeroClicado: Int) {
            for (i in adjLists[vertex]) {
                if (!visited[i] && i == numeroClicado) {
                    queue.add(i)
                    visited[i] = true
                }
            }

            if (qtdVizinhos != 0) {
                qtdVizinhos--
            }
            if (queue.isNotEmpty() && qtdVizinhos == 0) {
                vertex = queue.poll()

                for (i in adjLists[vertex]) {
                    if (!visited[i]) {
                        qtdVizinhos++
                    }/* else {
                        when (vertex) {
                            0 -> {if (visited[13]) binding2.aresta013.setBackgroundColor(Color.RED); else { if (visited[9]) binding2.aresta09.setBackgroundColor(Color.RED)}}
                            1 -> {binding2.aresta17.isVisible = true; binding2.aresta18.isVisible = true; binding2.aresta19.isVisible = true}
                            2 -> binding2.aresta29.isVisible = true
                            3 -> {if (visited[8]) binding2.aresta38.setBackgroundColor(Color.RED); if (visited[14]) binding2.aresta314.setBackgroundColor(Color.RED)}
                            4 -> {binding2.aresta46.isVisible = true; binding2.aresta411.isVisible = true}
                            5 -> binding2.aresta58.isVisible = true
                            6 -> {binding2.aresta36.isVisible = true; binding2.aresta46.isVisible = true; binding2.aresta611.isVisible = true}
                            7 -> binding2.aresta17.isVisible = true
                            8 -> {binding2.aresta18.isVisible = true; binding2.aresta38.isVisible = true; binding2.aresta58.isVisible = true; binding2.aresta812.isVisible = true; binding2.aresta814.isVisible = true}
                            9 -> {binding2.aresta09.isVisible = true; binding2.aresta19.isVisible = true; binding2.aresta29.isVisible = true; binding2.aresta910.isVisible = true}
                            10 -> binding2.aresta910.isVisible = true
                            11 -> {binding2.aresta411.isVisible = true; binding2.aresta611.isVisible = true}
                            12 -> binding2.aresta812.isVisible = true;
                            13 -> {binding2.aresta013.isVisible = true; binding2.aresta313.isVisible = true}
                            14 -> {binding2.aresta314.isVisible = true; binding2.aresta814.isVisible = true}
                        }
                    }*/
                    when (i) {
                        0 -> binding2.button0.isVisible = true
                        1 -> binding2.button1.isVisible = true
                        2 -> binding2.button2.isVisible = true
                        3 -> binding2.button3.isVisible = true
                        4 -> binding2.button4.isVisible = true
                        5 -> binding2.button5.isVisible = true
                        6 -> binding2.button6.isVisible = true
                        7 -> binding2.button7.isVisible = true
                        8 -> binding2.button8.isVisible = true
                        9 -> binding2.button9.isVisible = true
                        10 -> binding2.button10.isVisible = true
                        11 -> binding2.button11.isVisible = true
                        12 -> binding2.button12.isVisible = true
                        13 -> binding2.button13.isVisible = true
                        14 -> binding2.button14.isVisible = true
                    }

                    when (vertex) {
                        0 -> {binding2.aresta09.isVisible = true; binding2.aresta013.isVisible = true}
                        1 -> {binding2.aresta17.isVisible = true; binding2.aresta18.isVisible = true; binding2.aresta19.isVisible = true}
                        2 -> binding2.aresta29.isVisible = true
                        3 -> {binding2.aresta36.isVisible = true; binding2.aresta38.isVisible = true; binding2.aresta313.isVisible = true; binding2.aresta314.isVisible = true}
                        4 -> {binding2.aresta46.isVisible = true; binding2.aresta411.isVisible = true}
                        5 -> binding2.aresta58.isVisible = true
                        6 -> {binding2.aresta36.isVisible = true; binding2.aresta46.isVisible = true; binding2.aresta611.isVisible = true}
                        7 -> binding2.aresta17.isVisible = true
                        8 -> {binding2.aresta18.isVisible = true; binding2.aresta38.isVisible = true; binding2.aresta58.isVisible = true; binding2.aresta812.isVisible = true; binding2.aresta814.isVisible = true}
                        9 -> {binding2.aresta09.isVisible = true; binding2.aresta19.isVisible = true; binding2.aresta29.isVisible = true; binding2.aresta910.isVisible = true}
                        10 -> binding2.aresta910.isVisible = true
                        11 -> {binding2.aresta411.isVisible = true; binding2.aresta611.isVisible = true}
                        12 -> binding2.aresta812.isVisible = true;
                        13 -> {binding2.aresta013.isVisible = true; binding2.aresta313.isVisible = true}
                        14 -> {binding2.aresta314.isVisible = true; binding2.aresta814.isVisible = true}
                    }
                }

                if (qtdVizinhos == 0) {
                    BFS_Visit(vertex)
                }
            }
            binding2.textViewFilaElementos.text = queue.toString()
        }
    }
}