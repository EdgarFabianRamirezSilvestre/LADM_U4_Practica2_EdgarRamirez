package mx.edu.ittepic.ladm_u4_practica2_edgarramirez

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), SensorEventListener {

    lateinit var lienzo : Lienzo
    lateinit var sensorManager : SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_GAME)
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_GAME)

        lienzo = Lienzo(this)
        setContentView(lienzo)
    }//onCreate

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) { }

    override fun onSensorChanged(event: SensorEvent) {
        var posX = event.values[0]

        //ACELEROMETRO
        if(event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            lienzo.posicionX = lienzo.posicionX + (-posX)
        }//if

        //PROXIMIDAD
        if(event.sensor.type == Sensor.TYPE_PROXIMITY) {
            lienzo.dia = (event.values[0] >= 5f)
        }//if

        lienzo.invalidate()
    }//onSensorChanged

}//class
