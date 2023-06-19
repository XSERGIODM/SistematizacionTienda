package com.xsergiodm.controller

import io.github.palexdev.materialfx.controls.MFXButton
import io.github.palexdev.materialfx.controls.MFXPasswordField
import io.github.palexdev.materialfx.controls.MFXTextField
import javafx.event.ActionEvent
import javafx.fxml.FXML

class Login_controller {

    @FXML
    private lateinit var btIniciarSesion: MFXButton

    @FXML
    private lateinit var tfUsuario: MFXTextField

    @FXML
    private lateinit var tpContrasenia: MFXPasswordField

    @FXML
    fun iniciar(event: ActionEvent) {
        println("Iniciando sesion")
    }
}


