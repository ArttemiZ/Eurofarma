/*
 *
 *  * Copyright (c) 2026 Inacia Santos
 *  *
 *  * Este código é propriedade de Inacia Santos.
 *  * Não pode ser copiado, modificado ou distribuído sem autorização.
 *
 */

package br.com.inaciasantos.eurofarma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.android.filament.utils.Utils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // ✅ inicializa o Filament ANTES de qualquer coisa
        Utils.init()

        setContent {
            AppNavigation()
        }
    }
}