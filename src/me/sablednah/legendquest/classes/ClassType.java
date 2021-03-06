package me.sablednah.legendquest.classes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;

import me.sablednah.legendquest.LevelItems;
import me.sablednah.legendquest.loadout.Loadout;
import me.sablednah.legendquest.skills.SkillDataStore;

public class ClassType {

	public String						name;
	public String						chatTag;
	public String						filename;
	public String						description;
	public String						longdescription;

	// frequency used for NPC chance.
	public int							frequency;

	// Allowed races for this class
	public List<String>					allowedRaces;
	public List<String>					allowedGroups;
	public List<String>					requires;
	public List<String>					requiresOne;

	public boolean						defaultClass;
	public boolean						mainClassOnly;
	public boolean						subClassOnly;

	public int							statStr;
	public int							statDex;
	public int							statInt;
	public int							statWis;
	public int							statCon;
	public int							statChr;
	public double						healthPerLevel;
	public double						manaPerLevel;
	public int							manaBonus;
	public double						manaPerSecond;

	public float						speedMod		= 0.0F;

	public String						perm;

	public List<Material>				allowedTools;
	public List<Material>				allowedArmour;
	public List<Material>				allowedWeapons;

	public List<Material>				dissallowedTools;
	public List<Material>				dissallowedArmour;
	public List<Material>				dissallowedWeapons;

	public boolean						allowCrafting;
	public boolean						allowSmelting;
	public boolean						allowBrewing;
	public boolean						allowEnchanting;
	public boolean						allowRepairing;
	public boolean						allowTaming;

	@Deprecated
	public boolean						allowEnchating;

	public List<Material>				disallowedCrafting;
	public List<Material>				disallowedSmelting;
	public List<Material>				disallowedBrewing;
	public List<Material>				disallowedEnchanting;
	public List<Material>				disallowedRepairing;
	public List<EntityType>				disallowedTaming;

	public int							skillPoints;
	public double						skillPointsPerLevel;
	public ArrayList<SkillDataStore>	availableSkills;
	public ArrayList<SkillDataStore>	outsourcedSkills;

	public double						xpAdjustKill	= 0.0D;
	public double						xpAdjustSmelt	= 0.0D;
	public double						xpAdjustMine	= 0.0D;
	public int							healthMod		= 0;

	public List<Loadout>				classLoadouts	= new ArrayList<Loadout>();

	public LevelItems					levelUp			= new LevelItems();

}
