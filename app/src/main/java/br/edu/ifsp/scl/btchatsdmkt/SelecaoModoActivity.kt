package br.edu.ifsp.scl.btchatsdmkt

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import br.edu.ifsp.scl.btchatsdmkt.BluetoothSingleton.Constantes.SERVIDOR_CODE
import br.edu.ifsp.scl.btchatsdmkt.BluetoothSingleton.Constantes.CLIENTE_CODE

class SelecaoModoActivity : AppCompatActivity() {

    private lateinit var servidorButton: Button
    private lateinit var clienteButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selecao_modo)

        servidorButton = findViewById(R.id.serverMode)
        clienteButton = findViewById(R.id.clientMode)
    }


    fun defineModoBlueTooth(view: View) {
        val intent = Intent(this@SelecaoModoActivity, MainActivity::class.java)

        if (view == servidorButton) {
            intent.setAction(SERVIDOR_CODE)
        } else {
            intent.setAction(CLIENTE_CODE)
        }

        startActivity(intent)
    }
}