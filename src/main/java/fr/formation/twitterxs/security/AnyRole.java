package fr.formation.twitterxs.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.security.access.annotation.Secured;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Secured({"ROLE_ACTUATOR", "ROLE_ADMIN", "ROLE_USER"})
public @interface AnyRole {

}
