package main.java.com.lemsviat.lemhomework134;

import java.util.HashMap;
import java.util.Map;

public class SkillController {

    private final SkillRepository skillRepository = new SkillRepository();


    public void create(int id, String name) {
        skillRepository.save(new Skill(id, name));
    }

    public void update(int skillId, String skillName) {
        Skill skill = skillRepository.findById(skillId);
        skill.setSkillName(skillName);
        skillRepository.update(skill);
    }

    public Skill read(int skillId) {
        return skillRepository.findById(skillId);
    }

    public void deleteById(int skillId) {
        Skill skill = skillRepository.findById(skillId);
        skillRepository.delete(skill);
    }
}
