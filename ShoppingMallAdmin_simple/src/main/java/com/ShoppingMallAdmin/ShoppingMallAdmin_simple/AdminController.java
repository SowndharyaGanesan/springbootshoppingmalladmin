package com.ShoppingMallAdmin.ShoppingMallAdmin_simple;

import org.aopalliance.aop.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private Advice adminService;

    @GetMapping
    public List<Admin> getAllAdmins() {
    	return ((AdminController) adminService).getAllAdmins();
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable Long id) {
    	return ((AdminController) adminService).getAdminById(id);    }

    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin) {
    	return ((AdminController) adminService).addAdmin(admin);
    }

    @PutMapping("/{id}")
    public Admin updateAdmin(@PathVariable Long id, @RequestBody Admin admin) {
    	return ((AdminController) adminService).updateAdmin(id, admin);
    }
    

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Long id) {
    	((AdminController) adminService).deleteAdmin(id);
    }
}
