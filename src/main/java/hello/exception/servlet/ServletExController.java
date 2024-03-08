package hello.exception.servlet;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
@Controller
@Slf4j
public class ServletExController {
    @GetMapping("/error-ex")
    public void errorEx() {
        log.error("예외 발생!");
        throw new RuntimeException("예외 발생!");
    }

    @GetMapping("/error-404")
    public void error404(HttpServletResponse httpServletResponse) throws IOException {
        log.error("예외 발생!");
        httpServletResponse.sendError(404, "404 오류!");
    }

    @GetMapping("/error-500")
    public void error500(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendError(500);
    }
}
