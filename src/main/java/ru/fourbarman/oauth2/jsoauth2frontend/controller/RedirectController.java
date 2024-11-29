package ru.fourbarman.oauth2.jsoauth2frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
Вся логика в JS + HTML
Этот контроллер просто обрабатывает все запросы от клиента и AuthServer (Keycloak)

AuthServer передает все параметры в ответе (redirect_uri), которые нужно правильно считать
(здесь через JS) уже на самой web странице.
Поэтому в контроллере нет параметров для чтения, только перенаправление.
 */

@Controller
public class RedirectController {

    //index page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    //если user успешно авторизовался сюда AuthServer отправит ответ с параметрами
    @GetMapping("/redirect")
    public String redirect() {
        return "redirect";
    }

    //обработка результата запроса от ResourceServer (с полученным раннее access_token)
    // т.е. сами бизнес-данные приложения
    @PostMapping("/result")
    public String result() {
        return "index";
    }
}
