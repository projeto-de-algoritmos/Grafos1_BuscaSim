package com.example.buscasim

import android.graphics.Matrix
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.buscasim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    data class Vertices(val no: Int,var visitado: Boolean, var vizinho: Vertices? = null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val grafo = arrayOfNulls<Vertices>(7)

        grafo[0] = Vertices(1, false, null)
        insere(grafo[0], 2, false)
        insere(grafo[0], 5, false)
        insere(grafo[0], 7, false)

        grafo[1] = Vertices(2, false, null)
        insere (grafo[1], 1, false)
        insere (grafo[1], 7, false)

        grafo[2] = Vertices(3, false, null)
        insere (grafo[2], 4, false)

        grafo[3] = Vertices(4, false, null)
        insere (grafo[3], 3, false)
        insere (grafo[3], 6, false)
        insere (grafo[3], 7, false)

        grafo[4] = Vertices(5, false, null)
        insere (grafo[4], 1, false)

        grafo[5] = Vertices(6, false, null)
        insere (grafo[5], 4, false)

        grafo[6] = Vertices(7, false, null)
        insere (grafo[6], 1, false)
        insere (grafo[6], 2, false)
        insere (grafo[6], 4, false)

        binding.textDado.text = grafo[1]?.no.toString()

        val fila = ArrayList<Int>()
        for (i in 1..7) {
            if (grafo[i]?.visitado == false) {
                grafo[i]?.let { fila.add(it.no) }
                grafo[i]?.visitado = true

                while (fila != null) {
                    val u = fila[0]
                    fila.removeAt(0)

                    for (vertice in grafo) {
                        if (grafo[u-1]?.visitado == false) {
                            //marcar a aresta
                            grafo[u-1]?.visitado = true
                            fila.removeAt(0)
                        }
                    }
                }
            }
        }
    }
    fun insere(vertice: Vertices?, numero: Int, visitado: Boolean): Boolean {
        val novoNo = Vertices(numero, visitado, vertice?.vizinho)

        vertice?.vizinho = novoNo

        return true
    }
}