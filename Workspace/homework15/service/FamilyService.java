package service;

import family.Children;
import family.Family;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    public Map<String, Double> generateMapLastNameSalary(Set<Family> families) {
        return families.stream().collect(Collectors.toMap(Family::getLastName, Family::getSalary));
    }

    public int countMaleChildren(Set<Family> families) {
        return families.stream()
                .reduce(0,
                        (maleCount, family) -> Math.toIntExact(
                                maleCount + family
                                        .getChildrens()
                                        .stream()
                                        .filter(children -> children.getSex() == 'm')
                                        .count()
                        ), Integer::sum);
    }

    public Set<Children> getFemaleChildren(Set<Family> families) {
        HashSet<Children> femaleChildrenSet = new HashSet<>();
        families
                .stream()
                .map(family -> family.getChildrens()
                        .stream()
                        .filter(children -> children.getSex() == 'w'))
                .forEach(childrenStream -> femaleChildrenSet.addAll(
                        childrenStream.collect(Collectors.toSet()))
                );
        return femaleChildrenSet;
    }

    public Map<String, Integer> generateMapLastNameCountChildren(Set<Family> families) {
        return families.stream()
                .collect(
                        Collectors.toMap(Family::getLastName, family -> family.getChildrens().size())
                );
    }

    public boolean checkFamilyWhoHasAChildWithName(String name, Set<Family> families) {
        return families.stream()
                .anyMatch(elem -> elem.getChildrens()
                        .stream()
                        .anyMatch(children -> children.getName().equals(name))
                );
    }
}
