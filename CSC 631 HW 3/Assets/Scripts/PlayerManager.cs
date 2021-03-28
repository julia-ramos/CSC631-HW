using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerManager : MonoBehaviour
{
    public GameObject cube;
    public GameObject sphere;

    // Start is called before the first frame update
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.F))
        {
            if (cube.activeSelf == true)
            {
                sphere.transform.position = cube.transform.position;
                cube.SetActive(false);
                sphere.SetActive(true);
            }
            else if (sphere.activeSelf == true)
            {
                cube.transform.position = sphere.transform.position;
                sphere.SetActive(false);
                cube.SetActive(true);
            }
        }
    }
}
