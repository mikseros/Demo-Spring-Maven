@RestController
class ThisWillActuallyRun {

    @GetMapping("/")
    String home() {
        return "Hello Mietek!"
    }
}