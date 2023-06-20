package com.xsergiodm.controller

import io.github.palexdev.materialfx.controls.MFXButton
import io.github.palexdev.materialfx.controls.MFXPasswordField
import io.github.palexdev.materialfx.controls.MFXTextField
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.layout.Pane
import javafx.stage.Stage

class Login_controller {

    @FXML
    private lateinit var btIniciarSesion: MFXButton

    @FXML
    private lateinit var tfUsuario: MFXTextField

    @FXML
    private lateinit var tpContrasenia: MFXPasswordField

    @FXML
    fun iniciar(event: ActionEvent) {
        val usuario = tfUsuario.text
        val contrasenia = tpContrasenia.text

        if (usuario == "admin" && contrasenia == "admin") {
            val fxmlLoader =
                FXMLLoader(Login_controller::class.java.getResource("/com/xsergiodm/view/Manager_view.fxml"))
            val parent = fxmlLoader.load<Pane>()
            val scene = Scene(parent)
            val css = this.javaClass.getResource("/com/xsergiodm/style/Manager_style.css")
            scene.stylesheets.add(css!!.toExternalForm())
            val stage = Stage()
            stage.scene = scene
            stage.show()
            val myStage = this.btIniciarSesion.scene.window as Stage
            myStage.close()
        } else {
            val alerta = Alert(Alert.AlertType.ERROR)
            alerta.title = "Inicio de sesión"
            alerta.headerText = "Inicio de sesión fallido"
            alerta.contentText = "Usuario, contraseña incorrectos o no existentes, o cuenta inactiva."
            alerta.showAndWait()
        }
    }
}


