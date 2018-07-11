/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.springapp.dao;

import com.lfa.springapp.entity.Skill;
import java.util.List;



/**
 *
 * @author risunurya
 */
public interface SkillDAO {
    
    List<Skill> getAll();
    int insert(Skill s);
}
