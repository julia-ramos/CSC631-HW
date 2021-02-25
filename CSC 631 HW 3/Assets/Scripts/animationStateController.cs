using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class animationStateController : MonoBehaviour
{
    Animator animator;
    int isWavingHash;

    // Start is called before the first frame update
    void Start()
    {
        animator = GetComponent<Animator>();
        isWavingHash = Animator.StringToHash("isWaving");
    }

    // Update is called once per frame
    void Update()
    {
        bool isWaving = animator.GetBool(isWavingHash);
        bool wPressed = Input.GetKey("w");

        if(!isWaving && wPressed) {
            animator.SetBool(isWavingHash, true);
        }
        if(isWaving && !wPressed) {
            animator.SetBool(isWavingHash, false);
        }
    }
}
