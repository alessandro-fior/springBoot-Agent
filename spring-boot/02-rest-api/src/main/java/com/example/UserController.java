package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final List<User> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public UserController() {
        users.add(new User(counter.incrementAndGet(), "Alice", "alice@example.com"));
        users.add(new User(counter.incrementAndGet(), "Bob", "bob@example.com"));
    }

    @GetMapping
    public List<User> getAll() {
        return users;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return users.stream().filter(u -> u.id().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        User newUser = new User(counter.incrementAndGet(), user.name(), user.email());
        users.add(newUser);
        return newUser;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).id().equals(id)) {
                users.set(i, new User(id, user.name(), user.email()));
                return users.get(i);
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        users.removeIf(u -> u.id().equals(id));
    }
}
