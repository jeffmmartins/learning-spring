package io.github.jeffmmartins.Arquitetura.spring.montadora.configuration;

import io.github.jeffmmartins.Arquitetura.spring.montadora.Motor;
import io.github.jeffmmartins.Arquitetura.spring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4.0);
        motor.setModelo("XPTO-V");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4.0);
        motor.setModelo("HTO-V");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4.0);
        motor.setModelo("TUR-V");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
